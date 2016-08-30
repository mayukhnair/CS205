#!/bin/bash
# Write a script that reads a text file and print the number of unique
# words in it. The file name should be supplied to the script using input
# redirection operator <.

read -p "Enter file name: " filename
uniq < $filename
  

