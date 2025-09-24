function togglPassword(inputId, iconId) {
    const password = document.getElementById(inputId);
    const icon = document.getElementById(iconId);
    if (password.type === "password") {
        password.type = "text";
        icon.classList.replace("bi-eye", "bi-eye-slash");
    } else {
        password.type = "password";
        icon.classList.replace("bi-eye-slash", "bi-eye");
    }
}

function redirectInicio(event) {
    event.preventDefault();
    const pass = document.getElementById("password").value;
    const confirm = document.getElementById("confirmPassword").value;

    if (pass !== confirm) {
        alert("Las contraseñas no coinciden");
        return;
    }

    window.location.href = "inicio";
}


function togglePassword() {
    const password = document.getElementById("password");
    const icon = document.getElementById("toggleIcon");
    if (password.type === "password") {
        password.type = "text";
        icon.classList.replace("bi-eye", "bi-eye-slash");
    } else {
        password.type = "password";
        icon.classList.replace("bi-eye-slash", "bi-eye");
    }
}

function redirectIndex(event) {
    event.preventDefault();
    window.location.href = "inicio";
}

//flechita
const scrollToTopBtn = document.getElementById('scrollToTopBtn');

window.onscroll = function () {
    if (document.body.scrollTop > 100 || document.documentElement.scrollTop > 100) {
        scrollToTopBtn.classList.remove('d-none');
    } else {
        scrollToTopBtn.classList.add('d-none');
    }
};

scrollToTopBtn.addEventListener('click', function () {
    window.scrollTo({
        top: 0,
        behavior: 'smooth'
    });
});

//Contacto mensaje
document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('contactForm');
    const successMessage = document.getElementById('successMessage');

    form.addEventListener('submit', function (event) {
        event.preventDefault(); // evita recarga SIEMPRE

        if (!form.checkValidity()) {
            // Si el formulario es inválido -> mostrar errores Bootstrap
            event.stopPropagation();
            form.classList.add('was-validated');
        } else {
            // Si es válido -> mostrar mensaje, resetear, ocultar en 5s
            successMessage.style.display = 'block';

            setTimeout(function () {
                successMessage.style.display = 'none';
            }, 5000);

            form.reset();
            form.classList.remove('was-validated');
        }
    });
});
