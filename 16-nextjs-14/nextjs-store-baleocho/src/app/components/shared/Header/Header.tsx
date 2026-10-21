import Link from 'next/link';

export function Header(){
    return (
        <header>
            <h1>My header</h1>
            <nav>
            <ul>
                <li><Link href="/">Home</Link></li>
                <li><Link href="/store">Store</Link></li>
                <li><Link href="/store/el-zapato">El Zapato</Link></li>
            </ul>
            </nav>
            <hr />
        </header>
    )
}