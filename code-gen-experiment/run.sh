#!/bin/bash

ALLPASS=1;

for d in */; do
	cd $d
	PACKAGE=$(find . -type f -name "*.iml")
	
	if  [ ${#PACKAGE} -eq 0 ]
	then
		cd ..
		continue;
	fi
	
	
	END=$(expr ${#PACKAGE} - 6)
	PACKAGE=${PACKAGE:2:$END}
	javac src/iml/*/*.java

	PATHNAME=$(ls src/iml/)
	cd src
	RUN="iml.$PATHNAME.$PACKAGE"
	java $RUN > ../Actual.txt
	cd ..
	cp Expected.txt TempExpected.txt
	if [ $PACKAGE != "Vehicle_Abstract_inst" ]; then
		echo "" >> TempExpected.txt
		echo "" >> TempExpected.txt
	fi
	dos2unix TempExpected.txt > /dev/null 2>&1
	if ! diff -b TempExpected.txt Actual.txt &>/dev/null; then
		echo "Test $RUN Failed"
		ALLPASS = 0;
	fi
	rm TempExpected.txt
	cd ..
done 

if [ $ALLPASS -eq 1 ]
then
	echo "All Tests Passed Successfully"
fi

find . -type f -name "*.class" -delete