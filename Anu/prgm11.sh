#11. Shell script to print specified range of lines from given files


if [ $# -ne 3 ]
then 
	echo "syntax error"
	echo "<*.sh filename lowerlimt upperlimit>"
	exit
fi

file=$1
l=$2
u=$3
echo "\n----------------------"
echo "lines between $l - $u is printed below\n"

cat $file | head -$u | tail +$l
exit


<<com

OUTPUT

______________________


ksb@ksb-Lenovo-Product:~/ambili/linux/script/Experiments$ sh prgm11.sh prgm10.sh 1 7

----------------------
lines between 1 - 7 is printed below

 # 10. Shell script to display the content of a directory file in windows style



if [ $# -ne 0 ]
then
	 echo "Syntax error"


com



