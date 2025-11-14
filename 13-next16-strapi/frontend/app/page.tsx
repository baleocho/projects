import HeroSection from "@/components/hero-section";
import { Button } from "@/components/ui/button";
import { getHomePageData } from "@/lib/strappi";

export default async function Home() {
  const strapiData = await getHomePageData();
  console.log(strapiData);
  const {
    title,
    description,
    sections: [heroSectionData],
  } = strapiData.data;

  return (
    <>
      <HeroSection {...heroSectionData} />
      <main className="container mx-auto py-6">
        <h1 className="text-3xl font-bold">{title}</h1>
        <p className="text-gray-600">{description}</p>
        <Button>This is a button</Button>
      </main>
    </>
  );
}
