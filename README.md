# I2CS_Ex2
Ex2 - Basic Object-Oriented Programming & 2D Maze Algorithms  
Introduction to Computer Science 2026  
Ariel University  

Student: Daniel Suhanov  
ID: 207636481  

_____________________

## Overview
This exercise focuses on object-oriented programming and algorithmic operations on
2D raster maps represented as integer matrices (`int[][]`).
The map can represent an image, a grid, or a maze.

The main algorithms are based on **Breadth-First Search (BFS)** and include:
- Flood fill (connected components)
- Shortest path in a grid with obstacles
- Distance map from a source point

The assignment also includes drawing primitives and a simple GUI visualization.

_____________________

## Assignment Goals
- Implement the `Map2D` interface without modification
- Implement the `Pixel2D` interface using `Index2D`
- Apply BFS-based algorithms on a 2D grid
- Write JUnit tests for the core functionalities
- Visualize the map using a simple GUI (`StdDraw`)

_____________________

## Implemented Classes

### Index2D
Implements the `Pixel2D` interface.
Represents an (x,y) coordinate in a 2D grid.

Main methods:
- `getX()`, `getY()`
- `distance2D(Pixel2D p)`
- `equals(Object o)`
- `toString()`

_____________________

### Map
Implements the `Map2D` interface.
Represents a 2D raster map and supports map manipulation, drawing, and BFS algorithms.

#### Basic Operations
- Initialization from size and value
- Initialization from a 2D array (deep copy)
- get/set pixel values
- map dimensions
- equality comparison

#### Map Operations
- `addMap2D(Map2D p)`
- `mul(double scalar)`
- `rescale(double sx, double sy)`

#### Drawing Operations
- `drawRect(Pixel2D p1, Pixel2D p2, int color)`
- `drawLine(Pixel2D p1, Pixel2D p2, int color)`
- `drawCircle(Pixel2D center, double radius, int color)`

#### BFS Algorithms
- `fill(Pixel2D start, int newColor, boolean cyclic)`  
  Flood fill of a connected component.

- `shortestPath(Pixel2D p1, Pixel2D p2, int obsColor, boolean cyclic)`  
  Computes the shortest obstacle-avoiding path.

- `allDistance(Pixel2D start, int obsColor, boolean cyclic)`  
  Computes a distance map from a source point.  
  Unreachable cells are marked with `-1`.

_____________________

## GUI (Ex2_GUI)
The GUI visualizes the 2D map using `StdDraw`.

Features:
- Displays the map as colored cells
- Supports visualization of drawn shapes and BFS results
- Can load a map from a text file or generate a map programmatically

The GUI is intended for **visual demonstration only**, not for interaction.

_____________________

## JUnit Tests
JUnit tests were written to verify correctness of the core functionality.

### Test Coverage Includes:
- `Index2DTest` – tests for coordinate operations
- Map tests for:
  - `fill`
  - `shortestPath`
  - `allDistance`
  - `rescale`
  - `addMap2D`
  - `mul`
  - `equals`

All major algorithms and non-trivial methods are covered by unit tests.

_____________________

## GUI Output
The following screenshots demonstrate the GUI output:

- Drawing primitives (rectangle, line, circle)
- Visualization of a 2D map / maze

<img width="876" height="877" alt="4276b3624152156c9b378284bd068641" src="https://github.com/user-attachments/assets/aa82a833-7e03-45b7-af9a-1459c1bae877" />


_____________________

## How to Run

### Running the GUI
1. Open the project in IntelliJ
2. Run `Ex2_GUI.java`
3. The map will be displayed in a separate window

### Running the Tests
1. Open the test classes (`MapTest`, `MapAlgoTest`, `Index2DTest`)
2. Right-click → Run
