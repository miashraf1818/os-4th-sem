#!/bin/bash

# Prompt the user to enter the file name
echo "Enter the name of the file:"
read filename

# Check if the file exists
if [ -e "$filename" ]; then
    # Prompt the user to enter new permissions
    echo "Enter the new permissions for the file (in octal format, e.g., 755):"
    read permissions
    
    # Change the permissions of the file
    chmod $permissions "$filename"
    
    echo "Permissions for $filename changed to $permissions."
else
    echo "File does not exist."
fi
