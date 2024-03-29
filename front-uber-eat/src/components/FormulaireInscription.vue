<template>
    <div>
        <form @submit.prevent="soumettreForm">
            <div>
                <label for="nom">Nom:</label>
                <input type="text" id="nom" v-model="formulaire.nom" required>
            </div>
            <div>
                <label for="email">Email:</label>
                <input type="email" id="email" v-model="formulaire.email" required>
            </div>

            <button type="submit">S'inscrire</button>
        </form>
    </div>
</template>

<script lang="ts" setup>
import { ref } from 'vue';

const formulaire = ref({
  nom: '',
  email: '',
});

const soumettreForm = () => {
  console.log(formulaire.value);
  alert('Formulaire soumis ! Vérifiez la console pour les détails.');
};
</script>

