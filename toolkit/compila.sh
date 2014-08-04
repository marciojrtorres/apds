#!/bin/bash
mkdir bin
javac -cp bin src/toolkit/BadStringUtil.java  -d bin
javac -cp bin src/toolkit/GoodStringUtil.java  -d bin
javac -cp bin src/toolkit/Main.java        -d bin