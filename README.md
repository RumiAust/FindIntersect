# FindIntersectionApp - How to run the project
- This project is the backend part and to see the output you need run the Frontend server
- Frontend server can be found by  [FindIntersection Frontend](https://github.com/RumiAust/FindIntersectionAppUI)
- The Spring Boot project by defaults run on 8080 port
- You can use `mvn clean install` to build the project before you run
- You can run the project by clicking run icon or run on debug mode or using the cmd `mvn spring-boot:run` in the terminal
- The project should start running in 8080 port 
- In case the 8080 port is blocked, you can change the port number under resource `application.properties` file `server.port:yourPortNumber`
- Once the backend is running
- Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`.
- Insert two collection size like collection one 60, collection two 90
- The radio button is to decide which list you want to make Hashset or which one to be the iterator 
- You the leave the decision on program `Set large list to Hashset` that will take the large set as Hashset
- In case both set is equal in above option, it will take list one as hashset
- Click on the submit button and the result should appear below
- You can use the reset button to reset all the parameters
- You can find a documentation pdf under documents folder with images of this program output
 
