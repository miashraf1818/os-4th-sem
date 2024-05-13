#!/bin/bash

# Get the path to the file to check
file_path=$1

# Check if the file exists
if [ -f "$file_path" ]; then
    echo "The file $file_path exists."
else
    echo "The file $file_path does not exist."
fi
