#Shell script to modify cp command considering all error possibilities


if [ $# -ne 2 ]
then 
	echo "syntax error <$0> <sorce file> <destination file>"
	exit 1
fi
if [ ! -f $1 ]
then
	echo " $1 not exists or it is not an ordinary file"
	exit 2
fi
if [ ! -r $1 ]
then
	echo " $1 is not readable"
	exit 5
fi

if [ -f $2 ]
then 
	echo "target file exists.Do you want to Overwrite(y/n)"
	read ans
	if [ $ans = "n" ]
	then 
		exit 3
	fi
	if [ ! -w $2 ]
	then
		echo "$2 not writable"
		exit 4

	fi
fi
cp $1 $2
echo "file successfully copied"

exit 0	




<<com

ksb@ksb-thinkcentre-edge72:~/Aneetha/Network/Demo$ sh pgm14.sh
syntax error
pgm14.sh file1 file2

ksb@ksb-thinkcentre-edge72:~/Aneetha/Network/Demo$ sh pgm14.sh ppp.sh
syntax error
pgm14.sh file1 file2

ksb@ksb-thinkcentre-edge72:~/Aneetha/Network/Demo$ sh pgm14.sh ppp.sh pwd.sh
ppp.sh is not existing or not an ordinary file

ksb@ksb-thinkcentre-edge72:~/Aneetha/Network/Demo$ sh pgm14.sh p1.sh p2.sh
Target file exists, Over write it (y/n) : 
n

ksb@ksb-thinkcentre-edge72:~/Aneetha/Network/Demo$ sh pgm14.sh p1.sh p2.sh
Target file exists, Over write it (y/n) : 
y
File Copied

com
