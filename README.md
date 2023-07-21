
# 🛠  Technology Stack:

**Spring Boot:** Used to create a robust and scalable RESTful API with minimal configuration.

**Spring Data JPA:** Provided seamless integration with the MySQL database and simplified database operations.

**Spring Security:** Implemented to secure the API endpoints, ensuring that only authorized users can access them.

**MySQL Database:** Used as the persistent storage to store and manage todo items efficiently.

### live WebApp At:
https://todomanagementrestapi-production.up.railway.app/api/todo/getalltodos

# TodoREST API Project

The TodoREST API project is a powerful and efficient web application built using Spring Boot, Spring Data JPA, and Spring Security, with MySQL as the underlying database. This RESTful API enables users to manage their todo list effectively by providing CRUD (Create, Read, Update, Delete) operations for todo items.

# Key Features:
### 1. Create Todo Item:

Endpoint: POST   **/api/todo/create** 

Description:

Allows users to add a new todo item to their list with a title, description, and completion status.
Request Body: TodoDto object representing the todo item data.

### 2. Get Todo Item by ID:

**Endpoint:** GET **/api/todo/get/{id}**

**Description:** Retrieves a specific todo item by its unique **ID**.

**Path Variable:** id (long) - The unique identifier of the todo item.

### 3. Get All Todo Items:

**Endpoint:** GET **/api/todo/getalltodos**

**Description:** Fetches all existing todo items for the user.
Response: List of TodoDto objects containing todo item details.

![Screenshot from 2023-07-21 20-33-54](https://github.com/shaikhsoheel185/SpringBoot_Blog_Webapp/assets/92295256/501f43ba-20ea-43fd-9a05-f786c99b91af)

### 4. Update Todo Item:

**Endpoint:**  PUT **/api/todo/update/{id}**
**Description:** Allows users to modify the details of an existing todo item.
**Path Variable:** id (long) - The unique identifier of the todo item to be updated.

**Request Body:** TodoDto object representing the updated todo item data.

### 5. Delete Todo Item:

**Endpoint:** DELETE /api/todo/delete/{id}

**Description:** Deletes a specific todo item from the user's list.

**Path Variable:**
 id (long) - The unique identifier of the todo item to be deleted.
Response: Success message indicating the item was successfully deleted.

Complete Todo Item:

**Endpoint:** PATCH  **/api/todo/complete/{id}**

**Description:** Marks a todo item as completed.

**Path Variable:** id (long) - The unique identifier of the todo item to be marked as completed.

**Response:** TodoDto object representing the updated todo item with the completion status.

### How to Use:

#### Clone the repository and set up the MySQL database with the required credentials.

#### Build and run the application using Maven or Gradle.
#### The API will be available at http://localhost:8080/api/todo.

#### You can use API clients like Postman or curl to interact with the endpoints and manage your todo list efficiently.

This TodoREST API project showcases my expertise in building RESTful APIs, database integration, and security implementation using Spring Boot and related technologies. It highlights my ability to design efficient data transfer objects (DTOs) and provides a practical demonstration of my problem-solving and software development skills


### Please feel free to explore the source code and test the API functionality to gain a deeper understanding of the project.