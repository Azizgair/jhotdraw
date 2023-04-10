# jhotdraw

JHotDraw is a Java-based drawing framework that provides tools for creating and editing graphical figures in a graphical user interface (GUI) application.

* heavy restructuring of classes and interfaces and cleanup
   ** complete attribute handling of Figure moved in class Attributes, access over attr()
   ** Drawing has no dependency to CompositeFigure anymore and implementations do not use AbstractCompositeFigure implementations
   ** Drawing has its own listener DrawingListener now instead of FigureListener and CompositeFigureListener
   ** contains(point, scale) is now called to take view scale into account for finding figures
   ** removed DEBUG mode and introduced some logging instead
   ** removed DOMStorable from Drawing, Figure
   ** introduced a new module jhotdraw-io for input output and dom storables
* JDK 17
* maven build process
* restructured project layout
  ** introduced submodules


##Installation
To use JHotDraw, follow these steps:
* Clone the JHotDraw repository to your local machine.
* Build the JHotDraw library using the provided build scripts or build tools of your choice.
* Include the generated JHotDraw library in your Java project's classpath.
* Import the necessary packages from JHotDraw in your Java code.

### Quickstart

First build the project with **maven** using: `mv clean install`. Now all jars are published to your local maven repository. And you can include those artifacts using e.g.

```xml
<dependency>
  <groupId>org.jhotdraw</groupId>
  <artifactId>jhotdraw-core</artifactId>
  <version>10.0-SNAPSHOT</version>
</dependency>
```

In module `jhotdraw-samples-mini` are small examples mostly highlighting one aspect of JHotdraw usage.
Additional to that are in module `jhotdraw-samples-misc` more sophisticated examples of using this library.


##Features
* Rendering: JHotDraw provides rendering capabilities for graphical figures, allowing you to draw shapes, colors, and stroke styles on the screen using Java's Graphics2D API.
* Event handling: JHotDraw handles user interactions with the drawing, such as mouse and keyboard events, providing event listeners to respond to user input.
* Coordinate transformations: JHotDraw manages the conversion between the coordinate systems of the drawing and the view, enabling proper rendering and interaction regardless of the zoom level or pan position.
* Selection handling: JHotDraw provides selection management for graphical figures in the drawing, allowing users to select and manipulate individual figures or groups of figures.
* Tool management: JHotDraw manages the active tool, which is responsible for creating and editing graphical figures in the drawing, and provides methods for setting and getting the active tool.
##Usage
To use JHotDraw in your Java application, follow these steps:
* Create an instance of the DefaultDrawingView class, which represents the view component for displaying and interacting with a drawing.
* Use the provided methods to render and manipulate graphical figures in the drawing, such as drawFigure(), moveFigure(), resizeFigure(), etc.
* Set up event listeners to handle user interactions with the drawing, such as mouse and keyboard events.
* Customize the behavior of JHotDraw by configuring options, settings, or files as needed.

For more detailed information on how to use JHotDraw, refer to the documentation and the code examples provided in the repository.

##Contribution Guidelines
JHotDraw welcomes contributions from the community. If you would like to contribute to the project, please follow these guidelines:
Fork the repository and create a new branch for your contribution.
Make your changes and submit a pull request to the develop branch.
Follow the code style and conventions of the project.
Provide clear and concise commit messages and documentation for your changes.
Participate in discussions and provide feedback on issues and pull requests.

## License

* LGPL V2.1
* Creative Commons Attribution 2.5 License

## History 

This is a fork of jhotdraw from https://github.com/wumpz/jhotdraw which is a fork from http://sourceforge.net/projects/jhotdraw.

##Contact
For any questions, issues, or feedback related to JHotDraw, please contact the project maintainer (Abdelaziz).


