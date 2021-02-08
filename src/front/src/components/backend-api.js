import axios from 'axios'

const AXIOS = axios.create({
    baseURL: `http://localhost:8081/api/`,
    timeout: 1000
});


export default {
    createUser(firstName, lastName, father, passport, birth, sal1, sal2, sal3) {
        let json = JSON.stringify({
            firstname: firstName,
            lastname: lastName,
            fathername: father,
            pasport: passport,
            birthDate: birth,
            salary: [{value: sal1}, {value: sal2}, {value: sal3}]
        })
        return AXIOS.post(`calculate`, json, {
            headers: {
                'Content-Type': 'application/json'
            }
        });
    },
    getResult() {
        return AXIOS.post(`result`, {
            headers: {
                'Content-Type': 'application/json'
            }
        });
    },
    getStats() {
        return AXIOS.post(`stats`, {
            headers: {
                'Content-Type': 'application/json'
            }
        });
    }
}
