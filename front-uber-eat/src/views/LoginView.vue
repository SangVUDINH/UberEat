<template>
    <form name="login-form">
        <div>
            <label for="utilisateurInput">utilisateur</label>
            <input id="utilisateurInput" type="text">
        </div>
        <div>
            <label for="motDePasseInput">mot de passe</label>
            <input id="motDePasseInput" type="password">
        </div>
        <button type="submit">Connexion</button>
    </form>
</template>

<script>
    export default {
        name: 'LoginView'
    }
</script>