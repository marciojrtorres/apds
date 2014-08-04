#!/bin/bash
rm -r dist
mkdir dist
jar cvf dist/toolkit.jar -C bin .o