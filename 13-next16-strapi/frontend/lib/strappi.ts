import qs from "qs";
const BASE_URL = "http://localhost:1337/api";
const QUERY_HOME_PAGE = {
  populate: {
    sections: {
      on: {
        "layout.hero-section": {
          populate: {
            HeroLink: {
              populate: true,
            },
            HeroLinkLogin: {
              populate: true,
            },
            Image: {
              populate: true,
            },
          },
        },
      },
    },
  },
};

export const getHomePageData = async () => {
  const query = qs.stringify(QUERY_HOME_PAGE);
  const response = await getStrappiData(`/home-page?${query}`);
  return response;
};

export const getStrappiData = async (url: string) => {
  try {
    const response = await fetch(`${BASE_URL}${url}`);
    if (!response?.ok) {
      throw new Error(`Response empty: ${response}`);
    }
    const data = await response.json();
    return data;
  } catch (error) {
    console.error(`Error fetching Strapi data: ${error}`);
    return null;
  }
};

export const STRAPI_BASE_URL = process.env.NEXT_PUBLIC_STRAPI_URL || 'http://localhost:1337';