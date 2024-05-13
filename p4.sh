#!/bin/bash


# Display the operating system type
echo "Your operating system type: $(uname -s)"
echo ""

# Display the current PATH setting
echo "Current PATH setting: $PATH"
echo ""

# Display the current working directory
echo "Current working directory: $(pwd)"
echo ""

# Display the available shells
echo "Available shells: $(cat /etc/shells)"
echo ""

