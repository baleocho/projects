import { UserInputError, gql } from 'apollo-server'
import { ApolloServer } from '@apollo/server'
import { startStandaloneServer } from '@apollo/server/standalone'
import { v1 as uuid } from 'uuid'
import axios from 'axios'

const persons = [
    {
        id: 'assqweqwe',
        firstName: "Brian",
        lastName: "Ochoa",
        phone: "3310",
        street: "Apolonio M. Aviles",
        city: "Guadalajara"
    },
    {
        id: 'assqwevzxcvzx',
        firstName: "Alejandro",
        lastName: "Ochoa",
        phone: "3310",
        street: "Apolonio M. Aviles",
        city: "Guadalajara"
    },
    {
        id: 'assqwasvgczx',
        firstName: "Pedro",
        lastName: "Ochoa",
        street: "Apolonio M. Aviles",
        city: "Guadalajara"
    }
]

const typeDefs = gql`
 enum YesNo {
    YES
    NO
 }
 type Address {
    street: String!
    city: String!
    fullAddress: String!
 }

 type Person {
    id: ID!
    firstName: String!
    phone: String
    lastName: String!
    fullName: String!
    check: String!
    address: Address!
 }

 type Query {
    personCount: Int!
    allPersons(phone: YesNo): [Person]
    findPersonByfirstName(firstName: String!): Person
 }

 type Mutation {
    addPerson(
        firstName: String!
        phone: String
        lastName: String!
        street: String!
        city: String!
    ): Person
    editNumber(
        firstName: String!
        phone: String!
    ): Person
 }
`

const resolvers = {
    Query: {
        personCount: () => {
            return persons.length
        },
        allPersons: async (root, args) => {
            const {data: personsData} = await axios.get('http://localhost:3000/persons')
            console.log("Data ", personsData)
            
            if (!args.phone) return personsData

            return personsData.filter(p => {
                return args.phone == "YES" ? p.hasOwnProperty("phone") : !p.hasOwnProperty("phone")
            })


        },
        findPersonByfirstName: (root, args) => {
            const { firstName } = args;
            return persons.find(person => person.firstName == firstName)
        }

    },
    Person: {
        fullName: (root) => {
            return `${root.firstName} ${root.lastName}`
        },
        address: (root) => {
            return {
                street: root.street,
                city: root.city,
                fullAddress: `${root.street}, ${root.city}`
            }
        },
        check: () => {
            return "Checked"
        }
    },
    Mutation: {
        addPerson: (root, args) => {
            if (persons.find(p => args.firstName == p.firstName)) {
                throw new UserInputError("A name user should be unique", { invalidArgs: args.firstName })
            }
            const person = { ...args, id: uuid() }
            persons.push(person) //Here we should update our database
            return person
        },
        editNumber: (root, args) => {
            const person = persons.findIndex(p => p.firstName == args.firstName)
            if (person == -1) return null
            persons[person] = { ...persons[person], phone: args.phone }
            return persons[person]
        }
    }
}

const server = new ApolloServer({
    typeDefs,
    resolvers
})

startStandaloneServer(server, {
    listen: { port: 400 }
}).then(({ url }) => { console.log(`Server ready at ${url}`) })

// server.listen().then(({url}) => {
//     console.log(`Server ready at ${url}`)
// })