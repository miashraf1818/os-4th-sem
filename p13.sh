#!/bin/bash

# Prompt the user to enter a number
echo "Enter a number to calculate its factorial:"
read num

# Initialize factorial to 1
factorial=1

# Calculate factorial using a loop
for ((i=1; i<=num; i++))
do
    factorial=$((factorial * i))
done

# Print the factorial
echo "The factorial of $num is: $factorial"
