<script setup lang="ts">
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <header>
    <div> 
      <nav>
        <RouterLink to="/sidebar">--</RouterLink>
        <RouterLink to="/">Home</RouterLink>
        <RouterLink to="/login">Connexion</RouterLink>
        <RouterLink to="/inscription">Inscription</RouterLink>
      </nav>
    </div>
  </header>

  <RouterView />
</template>

<style scoped>





nav a.router-link-exact-active {
  color: var(--color-text);
}

nav a.router-link-exact-active:hover {
  background-color: transparent;
}

nav a {
  display: inline-block;
  padding: 0 1rem;
  border-left: 1px solid var(--color-border);
}

nav a:first-of-type {
  border: 0;
}

</style>
