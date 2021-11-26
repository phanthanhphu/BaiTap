# Question Easy
1. use XOR all the section of the array, all of the section of the array, all the section, lặp đi lặp lại hai lần sẽ trở thành có kết quả bằng 0
2. the result will be only output section is a times
# Queestion Moderate
First we use the given index i, which will take the product of all the numbers to the left of it and multiply it by the product of all the numbers to the right.
The result will be the product of all numbers, except one at the given index i.
1. Khởi tạo mảng trống, leftArr[] và rightArr[], leftArr[i] sẽ chứa tích bên trái  và rightArr[i] sẽ chứa tích bên phải
2. Sử dụng hai vòng lặp khác nhau để điền giá trị cho hai mảng. 
mảng letfArr[0] sẽ là 1 vì không có phần tử nào ở bên trái phần tử đầu tiên. Còn phần tử còn lại, chúng ta chỉ cần sử dụng 
leftArr[i] = arr[i-1] * leftArr[i-1];
3. chúng ta bắt đầu với giá trị ban đầu là 1 trong  [length - 1] trong đó độ dài là số phần tử trong mảng và tiếp tục cập nhật R [i] ngược lại. 
 productArr[i] = leftArr[i]*rightArr[i];
4. chúng ta tìm thấy sản phẩm ngoại trừ tự là leftArr[i] * rightArr [i].
