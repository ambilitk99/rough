
<<com
7.Shell script to display message “Good morning”,”Good afternoon”,”Good evening” and “Goodnight” according to system time
com

if [ $# -ne 0 ]
then 
	echo "syntax error"
	exit
fi


t=`date +%k`

if [ $t -gt 6 -a $t -lt 12 ]
then 
	echo "GOOD MORNING"
elif [ $t -lt 16 ]
then
	echo "GOOD AFTERNOON"
elif [ $t -lt 20 ]
then
	echo "GOOD EVENING"
elif [ $t -le 23 ]
then
	echo "GOOD NIGHT"
fi

<<com

OUTPUT

ksb@ksb-Lenovo-Product:~/ambili/NTWRK/Experiments$ sh prgm7.sh
GOOD AFTERNOON

com
