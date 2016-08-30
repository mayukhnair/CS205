#!/bin/bash
# Write a script that calculates the number of lines containing `the` in all
# the text files present in the current directory.

printf "Scanning all .txt files in this directory for the word 'the'. \n"
printf "\n"
printf "Scanning all lines which separately contain 'the'... \n"
grep -i -c -w "the" *.txt
printf "Scanning all lines which include 'the' exclusively or as part of words...\n"
grep -i -c "the" *.txt
printf "\n"
