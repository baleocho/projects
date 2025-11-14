/* eslint-disable @next/next/no-img-element */
import { STRAPI_BASE_URL } from "@/lib/strappi";
import { Button } from "./ui/button";

export default function HeroSection(heroStrapiData: {
  Heading: string;
  SubHeading: string;
  HeroLink: { label: string };
  HeroLinkLogin: { label: string };
  Image: { url: string; alternativeText: string };
}) {
  console.log(heroStrapiData);
  const {
    Heading,
    SubHeading,
    HeroLink,
    HeroLinkLogin,
    Image: imageData,
  } = heroStrapiData;
  const imageURL = imageData?.url.startsWith("http")
    ? imageData.url
    : `${STRAPI_BASE_URL}${imageData.url}`;

  return (
    <section className="mx-auto h-[50vh] py-6 relative overflow-hidden">
      <img
        src={imageURL}
        alt={imageData.alternativeText}
        className="absolute inset-0 object-cover w-full h-full z-[-1]"
        height={1080}
        style={{
          aspectRatio: "1920/1080",
          objectFit: "cover",
        }}
        width={1920}
      />
      <div className="flex justify-center items-center w-full h-full flex-col">
        <h1 className="text-4xl font-bold mb-2 text-white text-center">
          {Heading}
        </h1>
        <span className="text-white mb-2 block text-center">{SubHeading}</span>
        <div className="flex w-max h-max justify-center items-center flex-row mt-4" style={{ gap: "1rem" }}>
          <Button variant="outline">{HeroLink.label}</Button>
          <Button>{HeroLinkLogin.label}</Button>
        </div>
      </div>
    </section>
  );
}
