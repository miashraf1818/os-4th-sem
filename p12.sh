echo -n "Enter a number: "
read n
echo -n "RESULT: "
if [ $((n % 2)) -eq 0 ]; then
    echo "$n is even"
else
    echo "$n is odd"
fi
