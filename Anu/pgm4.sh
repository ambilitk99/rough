#Shell script to rename all ordinary files in a directory with filename.PID of shell


if [ $# -ne 0 ]
then
	echo "Syntax is <$0>"
   	exit 1
fi
for i in *
do
 	if [ -f $i ]
  	then
   		newname="$i.$$"
   		mv $i $newname
  	fi
done


<<com

ksb@ksb-thinkcentre-edge72:~/Aneetha/Network/Demo$ ls -l
total 20
-rw-rw-r-- 1 ksb ksb 145 May 16 14:23 demo.sh
-rwxrw-rw- 1 ksb ksb 180 Apr  1 15:49 p1.sh
-rw-rw-r-- 1 ksb ksb 270 Apr  2 13:03 p2.sh
-rw-rw-r-- 1 ksb ksb 194 Apr  2 11:34 p3.sh
-rw-rw-r-- 1 ksb ksb 232 May 16 14:24 pgm4.sh

ksb@ksb-thinkcentre-edge72:~/Aneetha/Network/Demo$ sh pgm4.sh

ksb@ksb-thinkcentre-edge72:~/Aneetha/Network/Demo$ ls -l
total 20
-rw-rw-r-- 1 ksb ksb 145 May 16 14:23 demo.sh.6734
-rwxrw-rw- 1 ksb ksb 180 Apr  1 15:49 p1.sh.6734
-rw-rw-r-- 1 ksb ksb 270 Apr  2 13:03 p2.sh.6734
-rw-rw-r-- 1 ksb ksb 194 Apr  2 11:34 p3.sh.6734
-rw-rw-r-- 1 ksb ksb 232 May 16 14:24 pgm4.sh.6734
 
com

