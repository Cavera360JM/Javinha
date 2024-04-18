<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>
  <link rel="stylesheet" href="index.css">
  <link rel="icon" type="image/x-icon" href="emblema.png">

</head>
<body>
  <div class="container">
    <!-- Imagens do slideshow -->
    <img class="slideshow" src="https://images.drive.com.au/caradvice/image/private/c_fill,f_auto,g_auto,h_1080,q_auto:eco,w_1920/v1/efsulll3yxnnpmbissx7" alt="Imagem 1">
    <img class="slideshow" src="https://wallpapersmug.com/download/3840x2400/1f9944/sports-car-red-ferrari-laferrari.jpg" alt="Imagem 2">
    <img class="slideshow" src="https://www.hdcarwallpapers.com/walls/mclaren_p1_5k-HD.jpg" alt="Imagem 3">

    <!-- Formulário de login -->
    <div class="login-box">
      <h2>Login</h2>
      <form id="loginForm" action="principal.html">
        <div class="form-control">
          <label for="username">Usuário:</label>
          <input type="text" id="username" name="username" required>
        </div>
        <div class="form-control">
          <label for="password">Senha:</label>
          <input type="password" id="password" name="password" required>
        </div>
        <a class="login-link" href="principal.html">Entrar</a>
      </form>
      <p id="error-msg" class="error-msg"></p>
    </div>
  </div>

  <script>
    // Função para alternar entre as imagens
    var slides = document.querySelectorAll('.slideshow');
    var currentSlide = 0;

    function showSlide(index) {
      for (var i = 0; i < slides.length; i++) {
        slides[i].style.display = 'none';
      }
      slides[index].style.display = 'block';
    }

    // Inicia o slideshow
    showSlide(currentSlide);

    // Função para trocar as imagens a cada 3 segundos
    setInterval(function() {
      currentSlide = (currentSlide + 1) % slides.length;
      showSlide(currentSlide);
    }, 3000);

    // Função para animar o redirecionamento do site
    function animateRedirect(event) {
      event.preventDefault();
      document.querySelector('.container').classList.add('slideRight');
      setTimeout(function() {
        window.location.href = event.target.href;
      }, 1000);
    }

    // Adiciona um evento de clique aos links de login
    document.querySelector('.login-link').addEventListener('click', animateRedirect);
  </script>
</body>
</html>   
      

