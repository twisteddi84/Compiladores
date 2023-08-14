
directory=$(pwd)
file="$directory/$1"

if [ -e "$file" ]; then
    cd ../src/
    cat "$file" | antlr4-run
    javac outputDimana.java
else
    echo "The file or directory '$1' does not exist in the specified directory."
fi