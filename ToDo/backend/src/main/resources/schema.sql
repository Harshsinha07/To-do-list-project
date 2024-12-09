-- schema.sql: To-Do App Database Schema

-- Create the tasks table
CREATE TABLE tasks (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Unique task ID
    title VARCHAR(255) NOT NULL,       -- Task title
    completed BOOLEAN DEFAULT FALSE,  -- Task completion status
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP -- Timestamp of creation
);
