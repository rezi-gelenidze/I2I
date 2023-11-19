import java.util.Comparator;

public class MergeSort {
    // Details at Album.java:84
    private Comparator<Song> comparator;
    private boolean isAscending;

    public MergeSort(Comparator<Song> comparator, boolean isAscending) {
        this.comparator = comparator;
        this.isAscending = isAscending;
    }

    public Song[] sort(Song[] songs) {
        Song[] copiedArray = songs.clone();
        mergeSort(copiedArray);
        return copiedArray;
    }

    private void mergeSort(Song[] array) {
        if (array == null || array.length == 1)
            return; // sort is not needed

        int len = array.length;
        int halfLength = len / 2;

        // create halves
        Song[] leftHalf = new Song[halfLength];
        Song[] rightHalf = new Song[len - halfLength];

        // populate arrays
        for (int i = 0; i < halfLength; i++) {
            leftHalf[i] = array[i]; // left
        }

        for (int j = halfLength; j < len; j++) {
            rightHalf[j - halfLength] = array[j]; // right
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(array, leftHalf, rightHalf);
    }

    private void merge(Song[] array, Song[] left, Song[] right) {
        int leftLen = left.length;
        int rightLen = right.length;
        int i = 0, j = 0, k = 0; // i - left, j - right, k = array

        while (i < leftLen && j < rightLen) {
            // perform comparison according to isAscending and comparator
            int comparison = comparator.compare(left[i], right[j]);
            boolean condition = this.isAscending ?
                    comparison <= 0 :
                    comparison > 0;

            if (condition) {
                array[k] = left[i];
                i++;
            }
            else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // populate remaining at the left
        while (i < leftLen) {
            array[k] = left[i];
            k++;
            i++;
        }

        // populate remaining at the right
        while (j < rightLen) {
            array[k] = right[j];
            k++;
            j++;
        }
    }
}