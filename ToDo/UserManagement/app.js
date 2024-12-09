// Example JavaScript code for validation

// For Register Form Validation
document.getElementById('registerForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission

    const username = document.getElementById('username').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    if (!username || !email || !password) {
        alert("All fields are required!");
        return;
    }

    // Add more complex validation if necessary

    alert("Registration successful!");
});

// For Login Form Validation
document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    if (!username || !password) {
        alert("Both fields are required!");
        return;
    }

    // Add more complex validation if necessary

    alert("Login successful!");
});
