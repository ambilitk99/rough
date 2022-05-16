#8. Shell script to display a file from last line to first line


if [ $# -ne 1 ]
then
	echo "syntax error"
	echo " $0 filename"
	exit
fi

file=$1
ter=`tty`
exec < $file
c=0
while read line
do
c=`expr $c + 1`
done
exec < $ter

while [ 0 -le $c ]
do
cat $file | head -$c | tail +$c
c=`expr $c - 1`
done 


<<com 

OUTPUT

ksb@ksb-Lenovo-Product:~/ambili/NTWRK/Experiments$ sh prgm8.sh prgm5.sh
com


ksb@ksb-Lenovo-Product:~/ambili/NTWRK/rough$ 
second file removed
cde
enter filename 2:
abc
enter filename 1:
ksb@ksb-Lenovo-Product:~/ambili/NTWRK/rough$ sh prgm5.sh
files not identical
abc file2 differ: byte 1, line 1
file2
enter filename 2:
abc
enter filename 1:
ksb@ksb-Lenovo-Product:~/ambili/NTWRK/rough$ sh prgm5.sh

OUTPUT

<<com


echo "files not identical"
fi
	exit
	echo "second file removed"
	rm $f2
then
if [ $? -eq 0 ]
cmp $f1 $f2
read f2
echo "enter filename 2:"
read f1
echo "enter filename 1:"

#Shell script to compare two files. If the files are identical delete one

com

