for i in 1 2 3; do
    for j in 1 2 3; do
        echo -n "$(( (i - 1) * 3 + j )) "
    done
    echo
done
