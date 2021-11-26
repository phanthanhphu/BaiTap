# Question Easy
1. use XOR all the section of the array, all of the section of the array, all the section, lặp đi lặp lại hai lần sẽ trở thành có kết quả bằng 0
2. the result will be only output section is a times
# Queestion Moderate
1. Initialize an empty array, leftArr[] and rightArr[], leftArr[i] will contain the left product and rightArr[i] will contain the right product.
2. Use two different loops to populate the two arrays. Array letfArr[0] will be 1 because there is no element to the left of the first element. As for the other element, we just need to use leftArr[i] = arr[i-1] * leftArr[i-1].
3. we start with an initial value of 1 in [length - 1] where length is the number of elements in the array and keep updating R[i] backwards, productArr[i] = leftArr[i]*rightArr[i], we find the product except self as leftArr[i] * rightArr[i].
