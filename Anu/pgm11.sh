#Shell script to print specified range of lines from given files

if [ $# -eq 0 ]
then 
	echo "syntax error"
	echo "syntax is <$0> <filename1> <filename2> etc.."
	exit 1
fi

c=$#
echo "enter lower limit:"

read l
echo "enter upper limit:"
read u
file=$1

while [ $c -gt 0 ]
do 
echo "\nFile : $1 \nlines $l to $u"

cat $file | head -$u | tail -n +$l
c=`expr $c - 1`
shift
done
exit 0



<<com

ksb@ksb-thinkcentre-edge72:~/Aneetha/Network/Script$ sh pgm11.sh
syntax error
syntax is <pgm11.sh> <filename1> <filename2> etc..

ksb@ksb-thinkcentre-edge72:~/Aneetha/Network/Script$ sh pgm11.sh abc demo11.sh
enter lower limit:
2
enter upper limit:
5

File : abc 
lines 2 to 5
welcome
to
windows
mac

File : demo11.sh 
lines 2 to 5
welcome
to
windows
mac

 
com
