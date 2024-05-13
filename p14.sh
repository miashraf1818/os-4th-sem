echo "Enter Three Numbers: "
read num1
read num2
read num3

if [ $num1 -lt $num2 ] && [ $num1 -lt $num3 ]; then
    echo "$num1 is the smallest"
elif [ $num2 -lt $num1 ] && [ $num2 -lt $num3 ]; then
    echo "$num2 is the smallest"
else
    echo "$num3 is the smallest"
fi
