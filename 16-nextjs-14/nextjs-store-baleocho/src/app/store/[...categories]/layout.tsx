export default function Layout ({children}: {children: React.ReactNode}){
    return (
        <main>
            <nav>Mi navegacion dinamica</nav>
            {children}
        </main>
    )

}