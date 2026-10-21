interface CategoryProps {
    params: { categories: string[] };
}

export default async function Category(props: CategoryProps) {
    const { categories } = await props.params;
    console.log(categories);
    return (
        <h1>Category Dinamica {categories.join('/')}</h1>
    );
}