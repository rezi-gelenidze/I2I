# SpotiJy - Song Manager Project (Java OOP)

Welcome to the SpotiJy project repository! SpotiJy is a simple song manager program that allows you to store and manage data about songs, albums, and artists. This README will provide a brief overview of the project and its key features.

## Project Description

SpotiJy consists of several classes, each responsible for managing different aspects of the music data:

### Song
The Song class represents the smallest data entity in the software. It stores information about songs, including title, release year, duration, and likes. Key features of the Song class include:

- Creation of Song objects with multiple constructors.
- Ability to change the duration of a song and manage likes.
- Comparison of songs based on title, release year, and duration.
- Customized string representation of a Song.

### Album
The Album class allows you to store collections of songs in one object. It includes attributes like title, release year, and an array of Song objects. Key features of the Album class include:

- Adding songs to an album while preventing duplicates.
- Shuffling, sorting, and reversing songs in various ways.
- Customized string representation of an Album.

### Artist
The Artist class represents artists and their attributes, including first name, last name, birth year, albums, and singles. Key features of the Artist class include:

- Identifying the most and least liked songs of an artist.
- Calculating the total number of likes for an artist.
- Comparing artists based on their attributes.
- Customized string representation of an Artist.

### SpotiJy
The SpotiJy class is the main class of the software, responsible for managing a collection of artists. Key features of the SpotiJy class include:

- Adding artists to the collection.
- Finding the top trending artist, album, and song based on likes.
  
## Implementation Details

One notable implementation detail to highlight is the use of merge sort to solve the sorting problems in the Album class. Merge sort is a highly efficient sorting algorithm that ensures the sorting of songs is both accurate and optimized.

## Conclusion

SpotiJy is a comprehensive song management program that demonstrates object-oriented programming principles and sorting algorithms. Feel free to explore the code and use it as a reference for your own projects.
