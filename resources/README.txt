# simple-recognizer
Author: Thomas J Donahue
Date: 4/30/13

## Description

A Clojure library designed to recognize speech using Dynamic Time
Warping. For each word, there are 1 or 2 templates which are compared
against the sound to be recognized. The comparison is made by finding
the minimum path (by euclidean distance) between the two sound files.
For more infomation on Dynamic Time Warping, see:

http://en.wikipedia.org/wiki/Dynamic_time_warping

## Usage

java -jar simple-recognizer-1.0-standalone.jar filepath-to-sound-file


Notes:
The full filepath (from /home) to the file is required

Inside the jar are all of the sound files I used for testing. There
are 4 Red, 3 Green and 4 White. 

