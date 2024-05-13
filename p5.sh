#!/bin/bash

# Check if two arguments are provided
if [ "$#" -ne 2 ]; then
    echo "Usage: $0 <file1> <file2>"
    exit 1
fi

# Check permissions for file 1
echo "Permissions for '$1':"
ls -l "$1"
echo

# Check permissions for file 2
echo "Permissions for '$2':"
ls -l "$2"
echo

exit 0

