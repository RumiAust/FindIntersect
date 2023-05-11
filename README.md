# FindIntersectionApp - How to run the project
- This project is the backend part and to see the output you need run the Frontedn server
- Frontend server can be found by  [FindIntersection Frontend](https://github.com/RumiAust/FindIntersectionAppUI)
- The Spring Boot project by defaults run on 8080 port
- You can use `mvn clean install` to build the project before you run
- You can run the project by clicking run icon or run on debug mode or using the cmd `mvn spring-boot:run` in the terminal
- The project should start running in 8080 port 
- In case the 8080 port is blocked, you can change the port number under resource `application.properties` file `server.port:yourPortNumber`
- Once the backend is running
- Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`.
- Insert two list values in comma separated way example list one `1,2,3,4,5`  list two `3,4,5,6,7,8,9`
- The radio button is to decide which list you want to make Hashset or which one to be the iterator 
- You the leave the decison on program `Set large list to Hashset` that will take the large set as Hashset
- In case both set is equal in above option, it will take list one as hashset
- Click on the submit button and the result should appear below
- You can use the reset button to reset all the parametrs
- You can find a documentaion pdf under documentaion folder with images of this program output
 
