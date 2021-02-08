<template>
    <div>
        <h1 class="m-4">Введите данные</h1>
        <div style="display:flex" class="mx-3">
            <b-input-group prepend="Фамилия" class="my-2 mx-2">
                <b-form-input aria-label="Фамилия" v-model="lastname"></b-form-input>
            </b-input-group>
            <b-input-group prepend="Имя" class="my-2 mx-2">
                <b-form-input aria-label="Имя" v-model="firstname"></b-form-input>
            </b-input-group>
            <b-input-group prepend="Отчество" class="my-2 mx-2">
                <b-form-input aria-label="Отчество" v-model="fathername"></b-form-input>
            </b-input-group>
        </div>

        <div style="display:flex" class="mx-3">
            <b-input-group prepend="Серия и номер паспорта" class="my-2 mx-2">
                <b-form-input aria-label="Паспорт" v-model="pasport"></b-form-input>
            </b-input-group>
            <b-input-group prepend="Дата рождения" class="my-2 mx-2">
                <b-form-input aria-label="Дата рождения" type="date" v-model="dateBirth"></b-form-input>
            </b-input-group>
        </div>
        <b><h3 class="mt-3 mb-4">Зарплата за последние 3 месяца</h3></b>
        <div style="display:inline-block" class="mx-3">
            <b-input-group prepend="1 месяц" class="mb-2">
                <b-form-input aria-label="1" type="number" v-model="salary1"></b-form-input>
            </b-input-group>
            <b-input-group prepend="2 месяц" class="mb-2">
                <b-form-input aria-label="1" type="number" v-model="salary2"></b-form-input>
            </b-input-group>
            <b-input-group prepend="3 месяц" class="mb-2">
                <b-form-input aria-label="1" type="number" v-model="salary3"></b-form-input>
            </b-input-group>
        </div>

        <div class="my-3 px-5">
            <router-link :to="{path:'/result', props: {namee: 'sad'}}">
                <b-button pill size="lg" variant="info" @click="sendUser(firstname, lastname, fathername, pasport,dateBirth, salary1, salary2, salary3)">
                    Начать скоринг</b-button>
            </router-link>
        </div>
    </div>


</template>

<script>
    import api from "./backend-api"
    export default {
        name: "ScoringInput",
        data() {
            return {
                msg: "niasfasasfgga",
                firstname: "",
                lastname: "",
                fathername: "",
                pasport: "",
                dateBirth: "01.02.2020",
                salary1: 0,
                salary2: 0,
                salary3: 0
            }
        },
        methods: {
            sendUser (first, last, father, passport, birth, sal1, sal2, sal3) {
                api.createUser(first, last, father, passport, birth, sal1, sal2, sal3);
            }
        }
    }

</script>

<style scoped>

</style>