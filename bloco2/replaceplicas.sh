#!/bin/bash

# Check if a filename is provided as an argument
if [ $# -eq 0 ]
  then
    echo "Please provide a filename as an argument"
    exit 1
fi

# Check if the file exists
if [ ! -f $1 ]
  then
    echo "File not found: $1"
    exit 1
fi

# Replace all occurrences of ’ with '
sed -i "s/’/'/g" $1

echo "Done"
