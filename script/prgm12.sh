
  
# 12.Shell script to copy a set of files given as pairs at command prompt

if [ `expr $# % 2` -ne 0 -o $# -eq 0 ]
then
	echo "syntax error"
	echo "<$0> <source file> <destination file> etc..."
	echo "Arguments must be even number"
	exit 1
fi

i=`expr $# / 2`

while [ $i -gt 0 ]
do

cp $1 $2


shift
shift
i=`expr $i - 1`
done
exit 0


<<com

OUTPUT
-------

ksb@ksb-Lenovo-Product:~/ambili/NTWRK/Experiments$ cat abc
asdfgh
guik
ljkhgf
l;ko
warfsdfgd
jkoljip
qedwdsf
123445667
kkk,mgyhiowerw


ksb@ksb-Lenovo-Product:~/ambili/NTWRK/Experiments$ sh prgm12.sh abc newfile
ksb@ksb-Lenovo-Product:~/ambili/NTWRK/Experiments$ cat newfile
asdfgh
guik
ljkhgf
l;ko
warfsdfgd
jkoljip
qedwdsf
123445667
kkk,mgyhiowerw

com

