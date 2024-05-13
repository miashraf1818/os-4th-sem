#!/bin/bash

echo "Enter a sentence:"
read sentence

echo "Enter the word to search for:"
read word

if echo "$sentence" | grep -q "\<$word\>"; then
    echo "The word '$word' is present in the sentence."
else
    echo "The word '$word' is not present in the sentence."
fi

