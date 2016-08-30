#!/bin/bash
# Write a script to concatenate last 5 lines of all text files present in the
# current directory. The output file should be named as allmixedLast5.

echo "Concatenating last 5 lines of text files, check them out in allmixedLast5"
head -n 5 *.txt > allmixedLast5
