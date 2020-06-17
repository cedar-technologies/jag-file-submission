projectRelRegex="^\.\/(.*)\/target\/site\/jacoco\/jacoco\.xml$"
for file in $(find . -name "jacoco.xml")
do
    if [[ $file =~ $projectRelRegex ]]
    then
        projectRel="${BASH_REMATCH[1]}"
        echo "analyzing project: " $projectRel
        projectName="${projectRel//\//-}"
        JACOCO_SOURCE_PATH=${{ github.workspace }}/src/backend/$projectRel/src/main/java ./cc-test-reporter format-coverage ${{github.workspace}}/src/backend/$projectRel/target/site/jacoco/jacoco.xml --input-type jacoco --output coverage/$projectName-codeclimate.json;
        echo "coverage generated: coverage/$projectName-codeclimate.json;"
    else
        echo $file does not match
    fi
done


# for s in efiling-backend-demo jag-efiling-api
# do 
#     echo  
#     
# done