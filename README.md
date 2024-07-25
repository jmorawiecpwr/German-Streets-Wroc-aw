# German Streets Wroclaw

This repository contains a project to search and analyze street names in Wroclaw that have German origins. The main functionality is implemented in the `PrzeszukiwanieUlic.java` file.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Requirements](#requirements)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project aims to provide a tool for searching and analyzing street names in Wroclaw that have German origins. It can be used for historical analysis, educational purposes, or personal interest.

## Features

- Search for streets with German names.
- Display Polish and German street names.
- Easy-to-use graphical user interface (GUI) built with Swing.

## Requirements

- Java Development Kit (JDK) 8 or higher

## Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/jmorawiecpwr/German-Streets-Wroclaw.git
    ```

2. Navigate to the project directory:

    ```bash
    cd German-Streets-Wroclaw
    ```

3. Compile the Java source files:

    ```bash
    javac -d bin src/PrzeszukiwanieUlic.java
    ```

## Usage

1. Run the compiled Java program:

    ```bash
    java -cp bin PrzeszukiwanieUlic
    ```

2. A GUI window will appear. Enter the name of the street you want to search for in the text field and click the "Szukaj" button or press Enter.

3. The program will search for the street name in the `ulice.csv` file located in the `src` directory. If the street is found, it will display both the Polish and German names of the street.

## Contributing

Contributions are welcome! If you have any ideas or suggestions to improve this project, feel free to fork the repository and submit a pull request.

1. Fork the repository
2. Create a new branch (`git checkout -b feature-branch`)
3. Make your changes
4. Commit your changes (`git commit -m 'Add some feature'`)
5. Push to the branch (`git push origin feature-branch`)
6. Open a pull request

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.
