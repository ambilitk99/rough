

# 13.Shell script to count the occurrence of words in a file in a set of files

if [ $# -eq 0 ]
then 
	echo "Syntax error"
	echo "$0 file1 file2 etc..."
	exit
	fi

k=$#
j=0
echo "Enter a word"
read word


ter=`tty`
while [ $k -gt 0 ]
do
fname=$1

exec < $fname
i=0
while read line
do
	for l in $line
	do
		echo $l | grep $word > grp
		if [ $? -eq 0 ]
		then
			i=`expr $i + 1`
		fi
	done
done

j=`expr $j + $i`
echo "Occurrences of word $word in $fname - $i"
shift
k=`expr $k - 1`
exec < $ter
done

echo "Total occurrences word $word - $j"
rm grp





<<com

OUTPUT
------

ksb@ksb-Lenovo-Product:~/ambili/NTWRK/Experiments$ sh prgm13.sh abc xyz ac
Enter a word
abc
Occurrences of word abc in abc - 3
Occurrences of word abc in xyz - 4
Occurrences of word abc in ac - 1
Total occurrences word abc - 8


com














