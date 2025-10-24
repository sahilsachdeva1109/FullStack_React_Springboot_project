import products from "../data/products";
import PageHeading from "./PageHeading";
import ProductListings from "./ProductListings";

export default function Home() {
  return (
    <>
      <h1> Demo of Global CSS scope from Home </h1>
      <div className="home-container">
        <PageHeading title="Explore More Stickers!">
          Here you can find and shop for amaaaaazzzzz - wait for it inggggg
        </PageHeading>
        <ProductListings products={products} />
      </div>
    </>
  );
}
