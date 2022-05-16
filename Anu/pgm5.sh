#Shell script to compare two files. If the files are identical delete one

echo "enter filename 1:"
read f1
echo "enter filename 2:"
read f2
cmp $f1 $f2
if [ $? -eq 0 ]
then
	rm $f2
	echo "second file removed"
	exit
fi
echo "files not identical"


<<com

ksb@ksb-thinkcentre-edge72:~/Aneetha/Network/Demo$ sh pgm5.sh
enter filename 1:
p1.sh
enter filename 2:
p2.sh
p1.sh p2.sh differ: byte 70, line 4
files not identical


ksb@ksb-thinkcentre-edge72:~/Aneetha/Network/Demo$ sh pgm5.sh
enter filename 1:
p1.sh
enter filename 2:
pp1.sh
second file removed
 
com
